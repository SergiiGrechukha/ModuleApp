package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1531 {

    @Ignore    private SampleClass1532 sampleClass;

    public SampleClass1531(){
        sampleClass = new SampleClass1532();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}