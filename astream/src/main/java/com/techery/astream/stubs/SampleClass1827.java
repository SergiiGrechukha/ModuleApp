package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1827 {

    @Ignore    private SampleClass1828 sampleClass;

    public SampleClass1827(){
        sampleClass = new SampleClass1828();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}