package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass218 {

    @Ignore    private SampleClass219 sampleClass;

    public SampleClass218(){
        sampleClass = new SampleClass219();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}