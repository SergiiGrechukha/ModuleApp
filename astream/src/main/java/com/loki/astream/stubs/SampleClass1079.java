package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1079 {

    @Ignore    private SampleClass1080 sampleClass;

    public SampleClass1079(){
        sampleClass = new SampleClass1080();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}