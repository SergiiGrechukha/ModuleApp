package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1101 {

    @Ignore    private SampleClass1102 sampleClass;

    public SampleClass1101(){
        sampleClass = new SampleClass1102();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}