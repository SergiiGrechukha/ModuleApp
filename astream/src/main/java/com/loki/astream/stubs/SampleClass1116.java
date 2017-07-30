package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1116 {

    @Ignore    private SampleClass1117 sampleClass;

    public SampleClass1116(){
        sampleClass = new SampleClass1117();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}