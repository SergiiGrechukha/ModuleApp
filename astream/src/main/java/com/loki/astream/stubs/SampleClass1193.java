package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1193 {

    @Ignore    private SampleClass1194 sampleClass;

    public SampleClass1193(){
        sampleClass = new SampleClass1194();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}