package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass505 {

    @Ignore    private SampleClass506 sampleClass;

    public SampleClass505(){
        sampleClass = new SampleClass506();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}