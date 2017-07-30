package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass159 {

    @Ignore    private SampleClass160 sampleClass;

    public SampleClass159(){
        sampleClass = new SampleClass160();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}