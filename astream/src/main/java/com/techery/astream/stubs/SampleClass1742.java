package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1742 {

    @Ignore    private SampleClass1743 sampleClass;

    public SampleClass1742(){
        sampleClass = new SampleClass1743();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}