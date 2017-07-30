package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass903 {

    @Ignore    private SampleClass904 sampleClass;

    public SampleClass903(){
        sampleClass = new SampleClass904();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}