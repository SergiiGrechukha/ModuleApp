package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1847 {

    @Ignore    private SampleClass1848 sampleClass;

    public SampleClass1847(){
        sampleClass = new SampleClass1848();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}