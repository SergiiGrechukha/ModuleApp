package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass955 {

    @Ignore    private SampleClass956 sampleClass;

    public SampleClass955(){
        sampleClass = new SampleClass956();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}