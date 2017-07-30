package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass797 {

    @Ignore    private SampleClass798 sampleClass;

    public SampleClass797(){
        sampleClass = new SampleClass798();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}