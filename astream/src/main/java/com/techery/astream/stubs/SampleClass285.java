package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass285 {

    @Ignore    private SampleClass286 sampleClass;

    public SampleClass285(){
        sampleClass = new SampleClass286();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}