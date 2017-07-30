package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1117 {

    @Ignore    private SampleClass1118 sampleClass;

    public SampleClass1117(){
        sampleClass = new SampleClass1118();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}