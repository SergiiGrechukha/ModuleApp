package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1047 {

    @Ignore    private SampleClass1048 sampleClass;

    public SampleClass1047(){
        sampleClass = new SampleClass1048();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}