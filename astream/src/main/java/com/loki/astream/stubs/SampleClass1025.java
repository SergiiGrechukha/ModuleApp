package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1025 {

    @Ignore    private SampleClass1026 sampleClass;

    public SampleClass1025(){
        sampleClass = new SampleClass1026();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}