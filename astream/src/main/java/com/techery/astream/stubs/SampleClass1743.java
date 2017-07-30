package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1743 {

    @Ignore    private SampleClass1744 sampleClass;

    public SampleClass1743(){
        sampleClass = new SampleClass1744();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}