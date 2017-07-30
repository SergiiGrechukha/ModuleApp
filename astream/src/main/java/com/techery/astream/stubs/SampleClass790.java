package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass790 {

    @Ignore    private SampleClass791 sampleClass;

    public SampleClass790(){
        sampleClass = new SampleClass791();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}