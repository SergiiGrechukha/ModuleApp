package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1819 {

    @Ignore    private SampleClass1820 sampleClass;

    public SampleClass1819(){
        sampleClass = new SampleClass1820();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}