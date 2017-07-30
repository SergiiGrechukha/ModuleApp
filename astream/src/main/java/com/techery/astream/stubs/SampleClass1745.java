package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1745 {

    @Ignore    private SampleClass1746 sampleClass;

    public SampleClass1745(){
        sampleClass = new SampleClass1746();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}