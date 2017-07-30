package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass263 {

    @Ignore    private SampleClass264 sampleClass;

    public SampleClass263(){
        sampleClass = new SampleClass264();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}