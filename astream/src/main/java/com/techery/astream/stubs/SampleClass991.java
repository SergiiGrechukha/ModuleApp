package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass991 {

    @Ignore    private SampleClass992 sampleClass;

    public SampleClass991(){
        sampleClass = new SampleClass992();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}