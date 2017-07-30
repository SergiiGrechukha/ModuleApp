package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1052 {

    @Ignore    private SampleClass1053 sampleClass;

    public SampleClass1052(){
        sampleClass = new SampleClass1053();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}