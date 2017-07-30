package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1838 {

    @Ignore    private SampleClass1839 sampleClass;

    public SampleClass1838(){
        sampleClass = new SampleClass1839();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}