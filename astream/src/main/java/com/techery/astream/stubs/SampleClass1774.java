package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1774 {

    @Ignore    private SampleClass1775 sampleClass;

    public SampleClass1774(){
        sampleClass = new SampleClass1775();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}