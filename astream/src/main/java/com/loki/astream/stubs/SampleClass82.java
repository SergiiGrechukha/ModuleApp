package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass82 {

    @Ignore    private SampleClass83 sampleClass;

    public SampleClass82(){
        sampleClass = new SampleClass83();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}