package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1155 {

    @Ignore    private SampleClass1156 sampleClass;

    public SampleClass1155(){
        sampleClass = new SampleClass1156();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}