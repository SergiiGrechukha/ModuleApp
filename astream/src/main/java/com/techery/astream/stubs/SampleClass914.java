package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass914 {

    @Ignore    private SampleClass915 sampleClass;

    public SampleClass914(){
        sampleClass = new SampleClass915();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}