package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1846 {

    @Ignore    private SampleClass1847 sampleClass;

    public SampleClass1846(){
        sampleClass = new SampleClass1847();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}