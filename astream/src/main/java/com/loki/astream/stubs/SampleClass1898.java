package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1898 {

    @Ignore    private SampleClass1899 sampleClass;

    public SampleClass1898(){
        sampleClass = new SampleClass1899();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}