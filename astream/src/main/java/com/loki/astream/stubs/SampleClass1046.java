package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1046 {

    @Ignore    private SampleClass1047 sampleClass;

    public SampleClass1046(){
        sampleClass = new SampleClass1047();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}