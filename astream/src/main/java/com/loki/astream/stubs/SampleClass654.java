package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass654 {

    @Ignore    private SampleClass655 sampleClass;

    public SampleClass654(){
        sampleClass = new SampleClass655();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}