package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1884 {

    @Ignore    private SampleClass1885 sampleClass;

    public SampleClass1884(){
        sampleClass = new SampleClass1885();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}