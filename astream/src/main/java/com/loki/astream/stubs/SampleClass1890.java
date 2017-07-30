package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1890 {

    @Ignore    private SampleClass1891 sampleClass;

    public SampleClass1890(){
        sampleClass = new SampleClass1891();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}