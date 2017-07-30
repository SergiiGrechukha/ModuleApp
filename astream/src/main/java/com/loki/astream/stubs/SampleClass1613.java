package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1613 {

    @Ignore    private SampleClass1614 sampleClass;

    public SampleClass1613(){
        sampleClass = new SampleClass1614();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}