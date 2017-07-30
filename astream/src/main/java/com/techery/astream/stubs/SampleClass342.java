package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass342 {

    @Ignore    private SampleClass343 sampleClass;

    public SampleClass342(){
        sampleClass = new SampleClass343();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}