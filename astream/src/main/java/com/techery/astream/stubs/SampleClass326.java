package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass326 {

    @Ignore    private SampleClass327 sampleClass;

    public SampleClass326(){
        sampleClass = new SampleClass327();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}