package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass410 {

    @Ignore    private SampleClass411 sampleClass;

    public SampleClass410(){
        sampleClass = new SampleClass411();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}