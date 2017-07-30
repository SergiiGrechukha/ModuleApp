package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1632 {

    @Ignore    private SampleClass1633 sampleClass;

    public SampleClass1632(){
        sampleClass = new SampleClass1633();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}