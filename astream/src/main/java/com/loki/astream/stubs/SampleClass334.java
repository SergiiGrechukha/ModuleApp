package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass334 {

    @Ignore    private SampleClass335 sampleClass;

    public SampleClass334(){
        sampleClass = new SampleClass335();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}