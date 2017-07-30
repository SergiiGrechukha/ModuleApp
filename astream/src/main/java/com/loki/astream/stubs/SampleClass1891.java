package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1891 {

    @Ignore    private SampleClass1892 sampleClass;

    public SampleClass1891(){
        sampleClass = new SampleClass1892();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}