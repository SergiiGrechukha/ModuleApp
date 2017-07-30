package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1887 {

    @Ignore    private SampleClass1888 sampleClass;

    public SampleClass1887(){
        sampleClass = new SampleClass1888();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}